package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_40 {
    private final Production38_40 production = new Production38_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}