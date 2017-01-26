package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_62 {
    private final Production34_62 production = new Production34_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}