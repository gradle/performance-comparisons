package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_126 {
    private final Production34_126 production = new Production34_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}