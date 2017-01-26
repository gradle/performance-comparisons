package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_25 {
    private final Production19_25 production = new Production19_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}