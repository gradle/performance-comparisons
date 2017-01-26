package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_71 {
    private final Production94_71 production = new Production94_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}