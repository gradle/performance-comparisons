package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_42 {
    private final Production34_42 production = new Production34_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}