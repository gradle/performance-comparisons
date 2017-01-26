package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_199 {
    private final Production34_199 production = new Production34_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}