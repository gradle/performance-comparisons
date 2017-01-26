package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_154 {
    private final Production19_154 production = new Production19_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}