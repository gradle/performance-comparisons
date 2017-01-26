package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_138 {
    private final Production19_138 production = new Production19_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}