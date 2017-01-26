package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_93 {
    private final Production38_93 production = new Production38_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}