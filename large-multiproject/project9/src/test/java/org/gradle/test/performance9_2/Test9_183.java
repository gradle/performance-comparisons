package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_183 {
    private final Production9_183 production = new Production9_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}