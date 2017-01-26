package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_406 {
    private final Production14_406 production = new Production14_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}