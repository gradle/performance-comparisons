package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_145 {
    private final Production19_145 production = new Production19_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}