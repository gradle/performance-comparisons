package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_282 {
    private final Production38_282 production = new Production38_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}