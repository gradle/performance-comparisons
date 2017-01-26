package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_260 {
    private final Production34_260 production = new Production34_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}