package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_145 {
    private final Production64_145 production = new Production64_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}