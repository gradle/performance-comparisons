package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_209 {
    private final Production94_209 production = new Production94_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}