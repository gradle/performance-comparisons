package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_82 {
    private final Production78_82 production = new Production78_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}