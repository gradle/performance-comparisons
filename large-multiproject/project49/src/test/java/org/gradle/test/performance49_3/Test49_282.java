package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_282 {
    private final Production49_282 production = new Production49_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}