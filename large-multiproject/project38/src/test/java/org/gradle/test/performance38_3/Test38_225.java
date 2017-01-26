package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_225 {
    private final Production38_225 production = new Production38_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}