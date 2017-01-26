package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_183 {
    private final Production38_183 production = new Production38_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}