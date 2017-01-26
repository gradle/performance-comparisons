package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_49 {
    private final Production9_49 production = new Production9_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}