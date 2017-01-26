package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_282 {
    private final Production17_282 production = new Production17_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}