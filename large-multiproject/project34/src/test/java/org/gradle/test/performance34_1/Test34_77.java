package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_77 {
    private final Production34_77 production = new Production34_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}