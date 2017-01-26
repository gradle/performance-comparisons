package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_42 {
    private final Production19_42 production = new Production19_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}