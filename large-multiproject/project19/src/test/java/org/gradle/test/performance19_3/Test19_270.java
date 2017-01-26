package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_270 {
    private final Production19_270 production = new Production19_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}