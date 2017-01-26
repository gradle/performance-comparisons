package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_166 {
    private final Production94_166 production = new Production94_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}