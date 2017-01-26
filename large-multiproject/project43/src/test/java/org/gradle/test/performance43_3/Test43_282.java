package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_282 {
    private final Production43_282 production = new Production43_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}