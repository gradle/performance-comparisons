package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_2 {
    private final Production34_2 production = new Production34_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}