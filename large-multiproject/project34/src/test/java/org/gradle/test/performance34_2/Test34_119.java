package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_119 {
    private final Production34_119 production = new Production34_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}