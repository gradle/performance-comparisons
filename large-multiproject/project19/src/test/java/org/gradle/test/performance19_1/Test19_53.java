package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_53 {
    private final Production19_53 production = new Production19_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}