package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_61 {
    private final Production34_61 production = new Production34_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}