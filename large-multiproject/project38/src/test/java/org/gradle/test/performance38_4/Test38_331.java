package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_331 {
    private final Production38_331 production = new Production38_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}