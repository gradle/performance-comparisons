package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_282 {
    private final Production74_282 production = new Production74_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}