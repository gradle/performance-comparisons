package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_199 {
    private final Production19_199 production = new Production19_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}