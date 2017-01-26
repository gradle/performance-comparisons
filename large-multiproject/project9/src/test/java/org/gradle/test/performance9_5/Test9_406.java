package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_406 {
    private final Production9_406 production = new Production9_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}