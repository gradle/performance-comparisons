package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_225 {
    private final Production94_225 production = new Production94_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}