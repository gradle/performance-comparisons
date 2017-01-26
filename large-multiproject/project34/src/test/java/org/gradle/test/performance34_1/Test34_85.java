package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_85 {
    private final Production34_85 production = new Production34_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}