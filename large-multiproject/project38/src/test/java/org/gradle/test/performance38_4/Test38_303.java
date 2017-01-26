package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_303 {
    private final Production38_303 production = new Production38_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}