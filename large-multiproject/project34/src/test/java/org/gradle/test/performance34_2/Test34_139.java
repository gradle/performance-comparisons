package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_139 {
    private final Production34_139 production = new Production34_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}