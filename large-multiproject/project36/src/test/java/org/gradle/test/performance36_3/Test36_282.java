package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_282 {
    private final Production36_282 production = new Production36_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}