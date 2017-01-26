package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_104 {
    private final Production19_104 production = new Production19_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}