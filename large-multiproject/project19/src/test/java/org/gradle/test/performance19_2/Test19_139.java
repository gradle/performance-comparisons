package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_139 {
    private final Production19_139 production = new Production19_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}