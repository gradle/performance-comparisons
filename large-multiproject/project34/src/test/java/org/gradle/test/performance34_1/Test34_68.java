package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_68 {
    private final Production34_68 production = new Production34_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}