package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_34 {
    private final Production19_34 production = new Production19_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}