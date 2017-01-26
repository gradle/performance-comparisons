package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_85 {
    private final Production17_85 production = new Production17_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}