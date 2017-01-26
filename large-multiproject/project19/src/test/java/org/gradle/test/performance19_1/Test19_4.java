package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_4 {
    private final Production19_4 production = new Production19_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}