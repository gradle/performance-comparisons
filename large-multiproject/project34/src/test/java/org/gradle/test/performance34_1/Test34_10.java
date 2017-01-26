package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_10 {
    private final Production34_10 production = new Production34_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}