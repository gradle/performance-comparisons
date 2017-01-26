package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_246 {
    private final Production94_246 production = new Production94_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}