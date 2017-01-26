package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_96 {
    private final Production34_96 production = new Production34_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}