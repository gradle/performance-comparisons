package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_196 {
    private final Production34_196 production = new Production34_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}