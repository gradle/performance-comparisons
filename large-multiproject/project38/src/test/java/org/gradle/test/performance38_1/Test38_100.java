package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_100 {
    private final Production38_100 production = new Production38_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}