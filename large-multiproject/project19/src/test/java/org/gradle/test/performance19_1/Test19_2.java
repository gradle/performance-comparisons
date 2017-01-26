package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_2 {
    private final Production19_2 production = new Production19_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}