package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_222 {
    private final Production19_222 production = new Production19_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}