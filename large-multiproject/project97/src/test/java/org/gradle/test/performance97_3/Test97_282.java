package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_282 {
    private final Production97_282 production = new Production97_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}