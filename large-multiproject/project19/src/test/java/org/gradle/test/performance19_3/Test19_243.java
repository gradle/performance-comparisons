package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_243 {
    private final Production19_243 production = new Production19_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}