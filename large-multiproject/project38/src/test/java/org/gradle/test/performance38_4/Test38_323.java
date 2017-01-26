package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_323 {
    private final Production38_323 production = new Production38_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}