package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_166 {
    private final Production19_166 production = new Production19_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}